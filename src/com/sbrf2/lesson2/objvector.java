package com.sbrf2.lesson2;

class obVector {
    private double x;
    private double y;
    private double z;

    public obVector(double x, double y, double z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getLength()
    {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public double scal_Proiz(obVector vector)
    {
        return x * vector.x + y * vector.y + z * vector.z;
    }

    public obVector vec_Proiz(obVector vector)
    {
        return new obVector(
                y * vector.z - z * vector.y,
                z * vector.x - x * vector.z,
                x * vector.y - y * vector.x);
    }

    public static obVector[] creat_Vect(int n)
    {
        obVector[] vectors = new obVector[n];
        for(int i =0; i < n; i++)
        {
            vectors[i] = new obVector(Math.random(), Math.random(), Math.random());
        }
        return vectors;
    }
    public obVector summ(obVector vector) {
        return new obVector(
                x + vector.x,
                y + vector.y,
                z + vector.z);
    }
    public obVector razn(obVector vector)
    {
        return new obVector(
                x - vector.x,
                y - vector.y,
                z - vector.z);
    }
    @Override
    public String toString() {
        return "x=" + x +", y=" + y +", z=" + z +'}';
    }
    public static void main(String[] args) {
        obVector[] vectors = obVector.creat_Vect(10);
        System.out.println("Вектор0: "+ vectors[0]);
        System.out.println("Вектор1: "+vectors[1]);
        System.out.println("Сложение "+vectors[0].summ(vectors[1]));
        System.out.println("Вычитание "+vectors[0].razn(vectors[1]));
        System.out.println("Скалярное произведение "+vectors[0].scal_Proiz(vectors[1]));
        System.out.println("Векторное произведение"+vectors[0].vec_Proiz(vectors[1]));
        System.out.println("Длина "+vectors[0].getLength());

    }
}