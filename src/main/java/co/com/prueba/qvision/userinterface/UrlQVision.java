package co.com.prueba.qvision.userinterface;

public enum UrlQVision{
    UrlIndex("http://automationpractice.com/index.php"),
    UrlGmail("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");

    private final String url;

    UrlQVision(String url){
        this.url = url;
    }

    public String Url(){
        return url;
    }
}
