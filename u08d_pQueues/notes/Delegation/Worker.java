public interface Worker {
  public Result work();
}

class Secretary implements Worker {

   public Result work() {
     Result myResult = new Result();
     return myResult;
   }    
}

class Boss implements Worker {

   private Secretary secretary;

   public Result work() {
     if (secretary == null) {
        // no secretary - nothing get's done
        return null;
     }
     return secretary.work();
   }

   public void setSecretary(Secretary secretary) {
       this.secretary = secretary;
   }
}