public class Entity {
    Object data;

    public Entity(Object data){
        this.data = data;
    }

    @Override
    public String toString() {
        return String.valueOf(this.data);
    }
}