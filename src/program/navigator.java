package program;

class NavigatorPushNode extends widget  {
    private String context;

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    @Override
    public String toString() {
        return "NavigatorPushNode{" +
                "context='" + context + '\'' +
                '}';
    }
}

class MaterialPageRouteNode extends widget {
    private String builder;
    private String context;

    public String getBuilder() {
        return builder;
    }

    public void setBuilder(String builder) {
        this.builder = builder;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    @Override
    public String toString() {
        return "MaterialPageRouteNode{" +
                "builder='" + builder + '\'' +
                ", context='" + context + '\'' +
                '}';
    }
}

class PageInstanceNode extends widget {
    private String typeName;

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Override
    public String toString() {
        return "PageInstanceNode{" +
                "typeName='" + typeName + '\'' +
                '}';
    }
}