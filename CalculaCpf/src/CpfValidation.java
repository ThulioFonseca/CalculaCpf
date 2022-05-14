public class CpfValidation {
    
        public static boolean isValid(String cpf) {
            if (cpf.length() != 11) {
                return false;
            }
            if (cpf.equals("00000000000") || cpf.equals("11111111111") || cpf.equals("22222222222") || cpf.equals("33333333333") || cpf.equals("44444444444") || cpf.equals("55555555555") || cpf.equals("66666666666") || cpf.equals("77777777777") || cpf.equals("88888888888") || cpf.equals("99999999999")) {
                return false;
            }
            int d1 = 0;
            for (int i = 0; i < 9; i++) {
                d1 += Integer.parseInt(cpf.substring(i, i + 1)) * (10 - i);
            }
            d1 = 11 - (d1 % 11);
            if (d1 > 9) {
                d1 = 0;
            }
            int d2 = 0;
            for (int i = 0; i < 9; i++) {
                d2 += Integer.parseInt(cpf.substring(i, i + 1)) * (11 - i);
            }
            d2 += d1 * 2;
            d2 = 11 - (d2 % 11);
            if (d2 > 9) {
                d2 = 0;
            }

            if (d1 == Integer.parseInt(cpf.substring(9, 10)) && d2 == Integer.parseInt(cpf.substring(10, 11))){

                return true;
            }

            return false;
        }


    
}
