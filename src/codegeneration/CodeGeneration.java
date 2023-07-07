package codegeneration;

import SympolTable.sympolTable;
import com.sun.rowset.internal.Row;
import program.*;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class CodeGeneration {
    private static CodeGeneration single_instance = null;
    public String imageCode = "";
    public StringBuilder columnWidgetCode = new StringBuilder("");

    public StringBuilder rowWidgetCode = new StringBuilder("");

    //    public StringBuilder FormFieldCode = new StringBuilder("");
    String FormFieldCode = "";
    String ID = null;
    public String Pagename = "";
    sympolTable s = sympolTable.getInstance();
    private String ContainerCode = "";

    private  StringBuilder rowContainerChild = new StringBuilder("");
    int helper = 0;

    private StringBuilder ContainerStyleCode = new StringBuilder("");
    private String ButtonCode = "";
    private String containerChild = "";
    private String textWidgetCode = "";
    private String borderCode = "";
    private StringBuilder postData = new StringBuilder("");
    private String allFormCode = "";
    ArrayList<String> fields = new ArrayList<>();
    boolean formGenerated = false;

    public CodeGeneration(sympolTable s) {
        this.s = s;
    }

    public CodeGeneration() {
    }

    public static CodeGeneration getInstance() {
        if (single_instance == null)
            single_instance = new CodeGeneration();
        return single_instance;
    }

    public String GenerateImage(program.image t) {
        boolean isURL = false, isWidth = false, isHeight = false;
        for (int i = 0; i < t.ip.size(); i++) {
            if (t.ip.get(i) instanceof imageproperty && t.ip.get(i) != null) {
                isURL = true;
            }
            if (t.ip.get(i) instanceof width && t.ip.get(i) != null) {
                isWidth = true;
            }
            if (t.ip.get(i) instanceof height && t.ip.get(i) != null) {
                isHeight = true;
            }
        }
        imageCode = "<img src= " + ((imageproperty) t.ip.get(0)).url + (isHeight ? " height=" + "\"" + ((height) t.ip.get(2)).h : "") + "\"" + (isWidth ? " width=" + "\"" + ((width) t.ip.get(1)).w : "") + "\"" + ">";
        return imageCode;
    }


    public String GenerateFieldForColumn(ArrayList<String> fields) {
        StringBuilder sb = new StringBuilder("");
        sb.append("<table style=\"width:100%\" class=\"center\">\n");
        for (int i = 0; i < fields.size(); i++) {
//            sb.append(fields.get(i));
            sb.append("<tr>\n" +
                    "<td>" + fields.get(i) + "</td>\n" +
                    "</tr>\n"
            );
        }
        sb.append("</table>\n");
        allFormCode = ("<form name=\"frmDataEntry\" action=\"" +
                Pagename
                + ".php\" method=\"post\">\n"
                + sb.toString()
                + ButtonCode
                + "</form>\n");
        ButtonCode = "";
        fields.clear();
        return allFormCode;
    }

    public String GenerateFieldForRow(ArrayList<String> fields) {
        StringBuilder sb = new StringBuilder("");
        sb.append("<table style=\"width:100%\" class=\"center\">\n<tr>\n");
        for (int i = 0; i < fields.size(); i++) {
//            sb.append(fields.get(i));
            sb.append("<td>\n" +
                    fields.get(i) +
                    "\n</td>\n"
            );
        }
        sb.append("</table>\n");
        allFormCode = ("<form name=\"frmDataEntry\" action=\"" +
                Pagename
                + ".php\" method=\"post\">\n"
                + sb.toString()
                + ButtonCode
                + "</tr>\n</form>\n");
        ButtonCode = "";
        fields.clear();
        return allFormCode;
    }

    public void GenerateFormField(textField t) {
        String label = null;
        String type = "text";
        for (int i = 0; i < t.tp.size(); i++) {
            if (t.tp.get(i) instanceof textFieldHintTextProperty && ((textFieldHintTextProperty) t.tp.get(i)).hintText != null) {
                label = ((textFieldHintTextProperty) t.tp.get(i)).hintText;
            }
            if (t.tp.get(i) instanceof textFieldOnsubmitProperty && ((textFieldOnsubmitProperty) t.tp.get(i)).assignment.ID != null) {
                ID = ((textFieldOnsubmitProperty) t.tp.get(i)).assignment.ID;
            }
            if (t.tp.get(i) instanceof textFieldObscureTextProperty && ((textFieldObscureTextProperty) t.tp.get(i)).obscureText != false) {
                type = "password";
            }
        }
//        FormFieldCode = new StringBuilder("<input type=\"" + type + "\" name=\"" + ID + "\" placeholder=" + label + " />\n");
        FormFieldCode = "<input type=\"" + type + "\" name=\"" + ID + "\" placeholder=" + label + " />\n";
//        fields.add(String.valueOf(FormFieldCode));
        fields.add(FormFieldCode);
        FormFieldCode = "";
        GeneratepostData(Pagename);
        ButtonCode = "";

//        return FormFieldCode.toString();
    }

    public String GeneratepostData(String w) {
        if (w.equals(Pagename)) {
            postData.append("\n<?php\n $"
                    + ID
                    + " = $_POST['" + ID + "'];" +
                    "\n ?>\n");
        }
        return postData.toString();
    }

    public void GenerateButton(TextButtonexpr t) {
        if (t.onPressedexpr.navigatorPushNode.materialPageRouteNode.pageInstanceNode.constructorwithoutbody.classname != null)
            Pagename = t.onPressedexpr.navigatorPushNode.materialPageRouteNode.pageInstanceNode.constructorwithoutbody.classname.toString();
        ButtonCode = "<input type=\"submit\" name=\"submit\" value=" + t.childexpr.S.h + "/>\n";
        fields.add(ButtonCode);
        ButtonCode = "";
//        return ButtonCode;
    }

    public String GenerateContainer(container t) {
        t.id++;
        helper ++;
//        if (t.c instanceof TextButtonexpr) {
//            containerChild = GenerateButton((TextButtonexpr) t.c);
//            ButtonCode = "";
//        }
        if (t.c instanceof image) {
            containerChild = GenerateImage((image) t.c);
            imageCode = "";
        } else if (t.c instanceof textField) {
//            containerChild = GenerateFormField((textField) t.c);
//            FormFieldCode = new StringBuilder("");
        } else if (t.c instanceof TextWidget) {
            containerChild = GenerateTextWidget((TextWidget) t.c);
            textWidgetCode = "";
        } else if (t.c instanceof row){
            rowWidgetCode.setLength(0);
            rowContainerChild.append("<table style=\"width:100%\" class=\"center\">");
            String s = GenerateRowWidget((row) t.c);
//            if(helper == 0){
//                s = s.substring(0,s.length()/2);
//            }
            rowContainerChild.append("\n"+s);
            rowWidgetCode.setLength(0);
            rowContainerChild.append("\n </table>");
            containerChild = rowContainerChild.toString();
            rowContainerChild.setLength(0);
//            rowContainerChild = new StringBuilder("");
            s = "";
        }
        GenerateContainerStyle(t);
        ContainerCode =
                "<div id=\"container" + t.id + "\">\n" +
                        containerChild +
                        "</div>"
        ;
        containerChild = "";
        return ContainerCode;
    }

    public String GenerateContainerStyle(container t) {
        if (t.containerproperties.size() != 0) {
            ContainerStyleCode.append("#container" + t.id + "{ \n");
            for (int i = 0; i < t.containerproperties.size(); i++) {
                if (t.containerproperties.get(i) instanceof widthcontainer) {
                    widthcontainer wc = (widthcontainer) t.containerproperties.get(i);
                    ContainerStyleCode.append("width: " + wc.w + "px;\n");
                }
                if (t.containerproperties.get(i) instanceof heightcontaineer) {
                    heightcontaineer hc = (heightcontaineer) t.containerproperties.get(i);
                    ContainerStyleCode.append("height: " + hc.h + "px;\n");
                }
                if (t.containerproperties.get(i) instanceof BoxDecoration) {
                    BoxDecoration b = (BoxDecoration) t.containerproperties.get(i);
                    if (b.c != null) {
                        ContainerStyleCode.append("background: " + b.c.c + " ;\n");
                    }
                    if (b.cb != null) {
                        ContainerStyleCode.append("border-radius: " + b.cb.borderRadius + "px;\n");
                    }
                }
            }
            ContainerStyleCode.append("}\n");
        }
        return ContainerStyleCode.toString();
    }

    public String GenerateTextWidget(TextWidget t) {
        boolean isText = false, isAlign = false, isStyle = false, isColor = false, isFontSize = false;
        if (t.text != null) isText = true;
        if (t.textAlign != null) isAlign = true;
        if (t.textStyle != null) {
            isStyle = true;
            if (t.textStyle.color != null) isColor = true;
            if (t.textStyle.fontSize != 0.0) isFontSize = true;
        }
        String substring = " ";
        if (t.text.contains("$")) {
            int startIndex = t.text.indexOf('$');
            int endIndex = t.text.indexOf(" ", startIndex); // Find the index of the first space after the '$' character
            substring = t.text.substring(startIndex, endIndex);

        }
        String text = t.text.replace(substring, " ");
        textWidgetCode = "<p " + (isStyle ? "style=\"" + (isFontSize ? "font-size: "
                + t.textStyle.fontSize + "px; " : "")
                + (isColor ? "color: " + t.textStyle.color + "; " : "")
                + (isAlign ? "text-align: " + t.textAlign + "; " : "")
                + "\" " : (isAlign ? "style= \"text-align: " + t.textAlign + ";\" " : "")) + ">"
                + (isText ? text.substring(1, text.length() - 1) : " ")
                + (t.text.contains("$") ? "<?php echo " + substring + "; " + "?>" : "")
                + "</p>"
        ;
        return textWidgetCode;
    }

    public void generateHtmlCode(WidgetClass w) {
        try {

            FileWriter fileWriterHtml = new FileWriter("output//" + w.name + ".php");

            fileWriterHtml.write("<html>");
            fileWriterHtml.write("<head>\n");
            fileWriterHtml.write("\n<style>");
            if (borderCode != "") {
                fileWriterHtml.write("\n" + borderCode);
            }
            if (!ContainerStyleCode.toString().equals("")) {
                fileWriterHtml.write("\n" + ContainerStyleCode.toString());
            }
            fileWriterHtml.write("\n</style>\n</head>");
//            if (borderCode != "") {
//                fileWriterHtml.write("<head>\n");
//                fileWriterHtml.write("\n<style>");
//                fileWriterHtml.write("\n" + borderCode);
//                fileWriterHtml.write("\n</style>\n</head>");
//            }
            fileWriterHtml.write("\n<body>");
            if (w.name.equals(Pagename)) fileWriterHtml.write("\n" + postData);
            if (!columnWidgetCode.toString().equals("")) {
                fileWriterHtml.write("<table style=\"width:100%\" class=\"center\">");
                fileWriterHtml.write("\n" + columnWidgetCode.toString() + "\n");
                fileWriterHtml.write("</table>");
            }
            if (!rowWidgetCode.toString().equals("")) {
                fileWriterHtml.write("<table style=\"width:100%\" class=\"center\">");
                fileWriterHtml.write("\n" + rowWidgetCode.toString() + "\n");
                fileWriterHtml.write("</table>");
            }
            fileWriterHtml.write("\n" + imageCode);
            fileWriterHtml.write("\n" + textWidgetCode);

            fileWriterHtml.write("\n" + allFormCode);
            fileWriterHtml.write("\n" + ContainerCode);

            fileWriterHtml.write("\n</body>\n</html>");
            fileWriterHtml.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        imageCode = "";
        container.id = 0;
        FormFieldCode = "";
//        FormFieldCode = new StringBuilder("");
        allFormCode = "";
        ContainerCode = "";
        ContainerStyleCode = new StringBuilder("");
        ButtonCode = "";
        rowWidgetCode = new StringBuilder("");
        columnWidgetCode = new StringBuilder("");
        borderCode = "";
    }
    ///////////////////////////////////////////////////////////////

    /////////////////////////////////////////////////////////////
    public String GenerateFormFieldBorderRadius(textField t) {
        double borderRadius = 0;
        for (int i = 0; i < t.tp.size(); i++) {
            if (t.tp.get(i) instanceof textFieldBorderRadiusProperty && ((textFieldBorderRadiusProperty) t.tp.get(i)).borderRadius != 0) {
                borderRadius = ((textFieldBorderRadiusProperty) t.tp.get(i)).borderRadius;
            }
        }
        borderCode = "input {\n" +
                "            border-radius: " + borderRadius + "px;\n" +
                "        }";
        return borderCode;
    }

    public String GenerateColumnWidget(column c) {
        int childrenNum = c.columnProperties.columnChildren.W.size();
        ArrayList<widget> columnChildren = c.columnProperties.columnChildren.W;
        for (int i = 0; i < childrenNum; i++) {
            if (columnChildren.get(i) instanceof TextWidget) {
                columnWidgetCode.append("<tr>\n" +
                        "            <td>\n" +
                        GenerateTextWidget((TextWidget) columnChildren.get(i)) +
                        "                \n" +
                        "            </td>\n" +
                        "        </tr>\n");
                textWidgetCode = "";
            }

            if (columnChildren.get(i) instanceof image) {
                columnWidgetCode.append("<tr>\n" +
                        "            <td>\n" +
                        GenerateImage((image) columnChildren.get(i)) +
                        "                \n" +
                        "            </td>\n" +
                        "        </tr>\n");
                imageCode = "";
            }

            if (columnChildren.get(i) instanceof textField) {

                if (!formGenerated) {
                    columnWidgetCode.append("<tr>\n" +
                            "            <td>\n" +
                            GenerateFieldForColumn(fields) +
                            "                \n" +
                            "            </td>\n" +
                            "        </tr>\n");
                    formGenerated = true;
                }
//                    columnWidgetCode.append("<td>\n" +
//                            GenerateFieldForColumn(fields) +
//                            "</td> \n");


//                FormFieldCode = new StringBuilder("");
                FormFieldCode = "";
                allFormCode = "";

            }

            if (columnChildren.get(i) instanceof container) {
                columnWidgetCode.append("<tr>\n" +
                        "            <td>\n" +
                        GenerateContainer((container) columnChildren.get(i)) +
                        "                \n" +
                        "            </td>\n" +
                        "        </tr>\n");
                ContainerCode = "";
                containerChild = "";
            }
        }

        return columnWidgetCode.toString();
    }


    public String GenerateRowWidget(row r) {
        int childrenNum = r.getRowproperties().rowChildren.W.size();
        ArrayList<widget> rowChildren = r.rowproperties.rowChildren.W;
        rowWidgetCode.append("<tr>\n" + "\n");
        for (int i = 0; i < childrenNum; i++) {
            if (rowChildren.get(i) instanceof TextWidget) {
                rowWidgetCode.append("<td>\n" +
                        GenerateTextWidget((TextWidget) rowChildren.get(i)) +
                        "</td> \n");
                textWidgetCode = "";
            }
            if (rowChildren.get(i) instanceof container) {
                rowWidgetCode.append("<td>\n" +
                        GenerateContainer((container) rowChildren.get(i)) +
                        "</td> \n");
                ContainerCode = "";
                containerChild = "";
            }
            if (rowChildren.get(i) instanceof image) {
                rowWidgetCode.append("<td>\n" +
                        GenerateImage((image) rowChildren.get(i)) +
                        "</td> \n");
                imageCode = "";
            }

            if (rowChildren.get(i) instanceof textField) {

                rowWidgetCode.append("<td>\n" +
                        GenerateFieldForRow(fields) +
                        "</td> \n");


                FormFieldCode = "";
//                FormFieldCode = new StringBuilder("");
                allFormCode = "";
            }
//            if (rowChildren.get(i) instanceof TextButtonexpr) {
//                rowWidgetCode.append("<td>\n" +
//                        GenerateButton((TextButtonexpr) rowChildren.get(i)) +
//                        "</td> \n");
//
//                ButtonCode = "";
//            }
        }
        rowWidgetCode.append("\n" + "    </tr>");

        return rowWidgetCode.toString();
    }


}
