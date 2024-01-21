class Pair {
    //declare instance constants
    final int a;
    final int b;

    //declare a parameterized constructor
     public Pair(int a, int b) {
        this.a = a;
        this.b = b;
    }

    //override the method equals(Object obj)
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Pair otherPair = (Pair) obj;
        return (a == otherPair.a && b == otherPair.b) ||
                (a == otherPair.b && b == otherPair.a);
    }
}

class ColoredPair extends Pair {
    //declare an instance constant
    String color;
    //declare a parameterized constructor
    public ColoredPair(int a, int b, String color) {
        super(a, b);
        this.color = color;
    }
}
