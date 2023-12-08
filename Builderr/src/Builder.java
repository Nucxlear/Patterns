public class Builder {
    private final int i;
    private final long l;

    public Builder(int i, long l){
        this.i = i;
        this.l = l;
    }

    public static BuilderB builder(){
        return new BuilderB();
    }

    public static class BuilderB{
        private int i;
        private long l;

        private BuilderB(){

        }

        public BuilderB setI(int i){
            this.i = i;
            return this;
        }
        public BuilderB setL(int l){
            this.l = l;
            return this;
        }

        public Builder  build(){
            return new Builder(this.i, this.l);
        }
    }
}