package TASK;

public class Task {
    
    private final String title;
    private final String memo;
    private final int importance;
    private final String startDate;
    private final String endDate;
    
    public static class Builder {
        private String title;
        private String memo;
        private int importance;
        private String startDate;
        private String endDate;
        
        public Builder() {}
        
        public Builder(String title, String memo, int importance, String startDate, String endDate) {
            this.title = title;
            this.memo = memo;
            this.importance = importance;
            this.startDate = startDate;
            this.endDate = endDate;
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
        
        public Builder startDate(String value) {
            startDate = value;
            return this;
        }
        
        public Builder endDate(String value) {
            endDate = value;
            return this;
        }
        
        public Task build() {
            return new Task(this);
        }
    }   
    
    private Task(Builder builder) {
        title = builder.title;
        memo = builder.memo;
        importance = builder.importance;
        startDate = builder.startDate;
        endDate = builder.endDate;
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

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }
    
    
    
}
