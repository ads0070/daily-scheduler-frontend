package TODO;

public class Todo {
    
    private final String title;
    private final String memo;
    private final int importance;
    private final Boolean topFixed;
    private Boolean done;
    
    public static class Builder {
        private String title;
        private String memo;
        private int importance;
        private Boolean topFixed;
        private Boolean done;

        public Builder() {
        }

        public Builder(String title, String memo, int importance, Boolean topFixed, Boolean done) {
            this.title = title;
            this.memo = memo;
            this.importance = importance;
            this.topFixed = topFixed;
            this.done = done;
        }
        
        public Builder title(String value) {
            title = value;
            return this;
        }
        
        public Builder memo(String value) {
            memo = value;
            return this;
        }
        
        public Builder importance(int value) {
            importance = value;
            return this;
        }
        
        public Builder topFixed(Boolean value) {
            topFixed = value;
            return this;
        }
        
        public Builder done(Boolean value) {
            done = value;
            return this;
        }
        
        public Todo build() {
            return new Todo(this);
        }
    }
    
    private Todo(Builder builder) {
        title = builder.title;
        memo = builder.memo;
        importance = builder.importance;
        topFixed = builder.topFixed;
        done = builder.done;
    }
    
    public static Builder builder() {
        return new Builder();
    }

    public String getTitle() {
        return title;
    }

    public String getMemo() {
        return memo;
    }

    public int getImportance() {
        return importance;
    }

    public Boolean getTopFixed() {
        return topFixed;
    }
    
    public Boolean getDone() {
        return done;
    }
}
