package lr7.sr5;

public class Main5 {
    public static void main(String[] args) {

        SuperClass5 supObj = new SuperClass5("В Супер классе");
        supObj.ShowClassNameAndField();
        System.out.println();

        SubClassOne subObjOne = new SubClassOne("В первом подклассе", 55);
        subObjOne.ShowClassNameAndField();
        System.out.println();

        SubClassTwo subObjTwo = new SubClassTwo("Во втором подклассе", 'U');
        subObjTwo.ShowClassNameAndField();
        System.out.println();

        supObj = subObjOne;
        supObj.ShowClassNameAndField();
    }
}
