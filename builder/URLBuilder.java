package builder;

public class URLBuilder {

//    nested static class means an object of Builder can be made without creating an object of URLBuilder
    public static class Builder{
        private String protocol;
        private String hostname;
        private Integer port;
        private String pathParam="";
        private String queryParam="";

        public Builder protocol(String protocol){
            this.protocol=protocol;
            return this;
        }

        public Builder hostname(String hostname){
            this.hostname=hostname;
            return this;
        }

        public Builder port(Integer port){
            this.port=port;
            return this;
        }

        public Builder pathParam(String pathParam){
            this.pathParam=pathParam;
            return this;
        }

        public Builder queryParam(String queryParam){
            this.queryParam=queryParam;
            return this;
        }

        public URLBuilder build(){
            return new URLBuilder(this);
        }


    }

    private final String protocol;
    private final String hostname;
    private final Integer port;
    private final String pathParam;
    private final String queryParam;

    private URLBuilder(Builder builder){
        this.protocol=builder.protocol;
        this.hostname=builder.hostname;
        this.port=builder.port;
        this.pathParam=builder.pathParam;
        this.queryParam=builder.queryParam;
    }

    @Override
    public String toString() {
        String base= this.protocol+this.hostname;
        if(this.port!=null){
            base+=":"+this.port;
        }
        if(this.pathParam!=""){
            base+= "/"+this.pathParam;
        }
        if(this.queryParam!=""){
            base+="?"+this.queryParam;
        }
        return base;
    }
}
