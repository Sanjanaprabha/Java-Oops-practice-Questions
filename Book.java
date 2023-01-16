package oops;

abstract class Books {
    String Title;
    abstract void setTitle(String s);
    public String getTitle() {
        return Title;
    }

}
class MyBook extends Books{

    @Override
    void setTitle(String s) {
        this.Title=s;
    }
}
