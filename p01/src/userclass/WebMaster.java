package userclass;


public class WebMaster extends User implements Cloneable {
    private String webCite;
    public WebMaster(int id, String login, String password,String webCite) {
        super(id, login, password);
        this.webCite = webCite;
    }

    public String getWebCite() {
        return webCite;
    }

    public void setWebCite(String webCite) {
        this.webCite = webCite;
    }

    @Override
    public void printUser() {
        System.out.println("My webcite is "+this.webCite);
    }

    public String getTextInfo(){
        String w = super.getTextInfo();
        w+=", webcite: "+this.webCite;
        return w;
    }
    public String toString(){
        return "Мой сайт "+webCite;
    }
    public WebMaster clone(){
        return new WebMaster(id,login,password,webCite);
    }
}
