public class Encapsulation {
    private String tool;
    private String description;
    private int version;

    String s = "d";
    Encapsulation(String tool, String description, int version) {
        this.setTool(tool);
        this.setDescription(description);
        this.setVersion(version);
    }

    public String getName() {
        return this.tool;
    }


    public String getModel() {
        return this.description;
    }


    public int getVersion() {
        return this.version;
    }

    public void setTool(String tool) {
        this.tool = tool;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setVersion(int version) {
        this.version = version;
    }

}
