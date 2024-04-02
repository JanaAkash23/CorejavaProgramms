package Com.corjavaeigth;

interface A{}

class superclass implements A

{}

class TestQuestion extends superclass {

public static void main(String s[]) {

superclass superob = new superclass();

TestQuestion subob = new TestQuestion();

System.out.println(superob instanceof A);

System.out.println(superob instanceof TestQuestion);

System.out.println(subob instanceof A);

}

}