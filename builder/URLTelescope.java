package builder;

public class URLTelescope {
    private final String protocol;
    private String hostname;
    private Integer port;
    private String pathParam;
    private String queryParam;

    public URLTelescope(String protocol){
        this.protocol=protocol;
    }

    public URLTelescope(String protocol,String hostname){
        this(protocol);
        this.hostname=hostname;
    }

    public URLTelescope(String protocol,String hostname,Integer port){
        this(protocol,hostname);
        this.port=port;
    }

//    this kind of combinations of parameters we still have to take care of
//    also it's impossible to create another overloaded class which contains queryParams but not pathParam now
    public URLTelescope(String protocol,String hostname,String pathParam){
        this(protocol,hostname);
        this.pathParam=pathParam;
    }

    public URLTelescope(String protocol,String hostname,Integer port, String pathParam){
        this(protocol,hostname,port);
        this.pathParam=pathParam;
    }

    public URLTelescope(String protocol,String hostname,Integer port, String pathParam,String queryParam){
        this(protocol,hostname,port,pathParam);
        this.queryParam=queryParam;
    }
}
