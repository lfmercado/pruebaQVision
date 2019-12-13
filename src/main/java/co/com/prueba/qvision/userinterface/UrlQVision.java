package co.com.prueba.qvision.userinterface;

public enum UrlQVision{
    UrlIndex("http://automationpractice.com/index.php");

    private final String url;

    UrlQVision(String url){
        this.url = url;
    }

    public String Url(){
        return url;
    }
}
