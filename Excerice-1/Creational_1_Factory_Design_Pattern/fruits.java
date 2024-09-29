public class fruits {
    public fruitbasket getInstance(String str){
        // code to get instance of any class
        if(str.equals("apple")){
            return new apple();
        }
        else if(str.equals("bannana")){
            return new Bannana();
        }
        else if(str.equals("watermelon")){
            return new Watermelon();
        }
        return null;
    }
}

