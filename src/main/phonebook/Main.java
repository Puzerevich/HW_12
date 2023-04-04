package phonebook;

public class Main {

    public static void main(String[] args) {
        Record record = new Record("Smith", "0501112233");
        Record record1 = new Record("Ivanov", "0502223344");
        Record record2 = new Record("Sokol", "0503334455");
        Record record3 = new Record("Bill", "0504445533");
        Record record4 = new Record("Lisa", "0505556677");
        Record record5 = new Record("Snow", "054648898");
        Record record6 = new Record("Soros", "05068488997");
        Record record7 = new Record("Smith", "099999999");

        PhoneDirectory directory = new PhoneDirectory();

        directory.add(record);
        directory.add(record1);
        directory.add(record2);
        directory.add(record3);
        directory.add(record4);
        directory.add(record5);
        directory.add(record6);
        directory.add(record7);
        directory.add(record);
        System.out.println(directory.getList());

        System.out.println(directory.findAll("Smith"));
    }
}