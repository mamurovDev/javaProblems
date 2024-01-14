import java.util.Locale;
import java.util.Scanner;

class Material {
    private final String name;
    private final double density;

    public Material(String name, double density) {
        this.name = name;
        this.density = density;
    }

    public String getName() {
        return this.name;
    }

    public double getDensity() {
        return density;
    }

    @Override
    public String toString() {
        return String.format("%s;%.1f", name, density);
    }
}

class Subject {
    private String name;
    private Material material;
    private double volume;

    public Subject(String name, Material material, double volume) {
        this.name = name;
        this.material = material;
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public String getMaterial() {
        return material.getName();
    }

    public String getName() {
        return name;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getMass() {
        return material.getDensity() * volume;
    }

    @Override
    public String toString() {
        return String.format(Locale.US, "%s;%s;%.1f;%.2f;%.1f%n", name, material, material.getDensity(), volume, getMass());
    }
}

class Solution {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("EN"));
        try (Scanner sc = new Scanner(System.in)) {
            // Input material's name and density
            String materialName = sc.next();
            double materialDensity = sc.nextDouble();

            // Input subject's name and volume
            String subjectName = sc.next();
            double subjectVolume = sc.nextDouble();

            // Create Material instance
            Material material = new Material(materialName, materialDensity);

            // Create Subject instance
            Subject subject = new Subject(subjectName, material, subjectVolume);

            // Output Subject instance
            System.out.print(subject + " ");

            // Update subject material to copper
            Material copperMaterial = new Material("copper", 8500.0);
            subject.setMaterial(copperMaterial);

            // Output the mass of the updated subject
            System.out.printf("%.2f", subject.getMass());
        }
    }
}
