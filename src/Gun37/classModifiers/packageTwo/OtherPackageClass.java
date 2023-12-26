package Gun37.classModifiers.packageTwo;

import Gun37.classModifiers.packageOne.PublicModifierClass;

// Diğer paketten defaulta erişemedik.
public class OtherPackageClass {
    public static void main(String[] args) {
        PublicModifierClass sm3=new PublicModifierClass();
        //DefaultModifierClass sm1=new DefaultModifierClass();
    }
}
