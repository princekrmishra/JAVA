package IntroTopic;

public class DataTypeDemo {
    public static void main(String[] args) {
        //Integer type - 1 byte
        int age = 20;                      //  -2^31 to 2^31-1 default: 0 "4 Byte"
        System.out.println(age);
        long salary = 34532l;               //  -2^63 to 2^63-1 default: 0 "8 Byte"
        System.out.println(salary);
        short height = 34;                 //  -32768 to 32767 default: 0 "2 byte"
        System.out.println(height);
        byte range = 127;                  //  -128 to 127 default: 0, "1 byte"
        System.out.println(range);

        //floating
        float weight = 83.23f;            //32 bit floating point value.  "USED FOR SINGLE PRECISION" "4 byte"
        System.out.println(weight);
        double height2 = 5.6;             //64 bit floating point value. "DONT USE IF YOU WANT PRECISION" "8 byte"
        System.out.println(height2);

        //boolean - 1bit
        boolean isTrue;                   //true or false default: false;
        isTrue = true;
        System.out.println(isTrue);

        //char - 16 bit UNICODE character - 2 BYTE
        char letter = '\u0051';
        System.out.println(letter);

        //string
        String name = "Prince";
        System.out.println(name);




    }
}
