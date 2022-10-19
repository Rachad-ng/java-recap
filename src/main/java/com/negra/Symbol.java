package com.negra;

public enum Symbol {

    O {
        public int compare(Symbol s){
            int result = 0;

            switch (s){
                case O: break;

                case V: result = 1;
                        break;

                case W: result = -1;
                        break;
            }

            return result;
        }
    },
    V {
        public int compare(Symbol s){
            int result = 0;

            switch (s){
                case O: result = -1;
                        break;

                case V: break;

                case W: result = 1;
                        break;
            }

            return result;
        }
    },
    W {
        public int compare(Symbol s){
            int result = 0;

            switch (s){
                case O: result = 1;
                        break;

                case V: result = -1;
                        break;

                case W: break;
            }

            return result;
        }
    };

    public abstract int compare(Symbol s);
}
