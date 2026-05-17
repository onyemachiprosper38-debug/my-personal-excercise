let max = arr[0];

for (let i = 1; i < arr.length; i++) {
  if (arr[i] > max) {
    max = arr[i];
  }
}


public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}


public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 7, 2, 9, 5};

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println(max);
    }
}



public class Main {
    public static void main(String[] args) {
        String str = "hello";
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        System.out.println(reversed);
    }
}



public class Main {
    public static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(5)); // 120
    }
}














public class LoginService {

    public boolean login(String username, String password) {

        // check null or empty
        if (username == null || password == null) {
            return false;
        }

        if (username.isEmpty() || password.isEmpty()) {
            return false;
        }

        // validation rules
        if (username.length() < 3) {
            return false;
        }

        if (password.length() < 6) {
            return false;
        }

        return true;
    }
}
