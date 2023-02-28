package Gun39._05_OOP_Soru;

public class TechnoKitchen {

    public static void hazirla(IFood f){
        // Polymorphism - Cok cesitlilik
        if(f instanceof AdanaKebab){
            ((AdanaKebab) f).marinade();
            ((AdanaKebab) f).grill();
        } else if (f instanceof Lahmacun) {
            ((Lahmacun) f).dough();
            ((Lahmacun) f).addMeat();
            ((Lahmacun) f).bake();
        } else if (f instanceof Borsch) {
            ((Borsch) f).boil();
            ((Borsch) f).eatTomorrow();

        } else if (f instanceof Palov) {
            ((Palov) f).fry();
            ((Palov) f).boil();
        }

        f.taste();
        System.out.println();
    }
}
