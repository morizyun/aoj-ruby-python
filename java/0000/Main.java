import java.lang.StringBuffer;
import java.lang.System;

class Main {
    public static void main(String[] a) {
        var dollar = parseFloat(document.getElementById("dollar").value);
        var rate = parseFloat(document.getElementById("rate").value);
        document.getElementById("yen").innerText = Math.ceil(dollar * rate);
    }
}