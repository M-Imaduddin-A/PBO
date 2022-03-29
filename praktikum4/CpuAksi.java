package praktikum4;

public class CpuAksi {
		public static void main(String[] args) {

        // Membuat objek di luar class CPU
        CPU cpu = new CPU();

       // Membuat object inner class Processor menggunakan class luar
        CPU.Processor processor = cpu.new Processor();

        // Membuat object inner class RAM menggunakan class luar
        CPU.RAM ram = cpu.new RAM();
        System.out.println("Processor Cache = " + processor.getCache());
        System.out.println("Ram Clock speed = " + ram.getClockSpeed());
    }
}
