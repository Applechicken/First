package HomeWork2;

public class AnimalType {
    abstract class Animal {
        protected String Name;

        public Animal(String Name) {
            this.Name = Name;
        }

        public abstract void show();
    }

    abstract class Invertebrate extends Animal {
        public Invertebrate(String Name) {
            super(Name);
        }

        @Override
        public void show() {
            System.out.println("无脊椎动物：" + Name);
        }
    }

    abstract class Vertebrate extends Animal {
        public Vertebrate(String Name) {
            super(Name);
        }

        @Override
        public void show() {
            System.out.println("有脊椎动物：" + Name);
        }
    }

    class Coelenterate extends Invertebrate {
        public Coelenterate(String Name) {
            super(Name);
        }
    }

    class Mollusk extends Invertebrate {
        public Mollusk(String Name) {
            super(Name);
        }
    }

    class Arthropod extends Invertebrate {
        public Arthropod(String Name) {
            super(Name);
        }
    }

    class Annelid extends Invertebrate {
        public Annelid(String Name) {
            super(Name);
        }
    }

    class Flatworm extends Invertebrate {
        public Flatworm(String Name) {
            super(Name);
        }
    }

    class Nematode extends Invertebrate {
        public Nematode(String Name) {
            super(Name);
        }
    }

    class Snail extends Mollusk {
        public Snail() {
            super("蜗牛");
        }
    }

    class FieldSnail extends Mollusk {
        public FieldSnail() {
            super("田螺");
        }
    }

    class Mussel extends Mollusk {
        public Mussel() {
            super("河蚌");
        }
    }

    class Fish extends Vertebrate {
        public Fish(String Name) {
            super(Name);
        }
    }

    class Amphibian extends Vertebrate {
        public Amphibian(String Name) {
            super(Name);
        }
    }

    class Reptile extends Vertebrate {
        public Reptile(String Name) {
            super(Name);
        }
    }

    class Bird extends Vertebrate {
        public Bird(String Name) {
            super(Name);
        }
    }

    class Mammal extends Vertebrate {
        public Mammal(String Name) {
            super(Name);
        }
    }

    class Snake extends Reptile {
        public Snake() {
            super("蛇");
        }
    }

    class Lizard extends Reptile {
        public Lizard() {
            super("蜥蜴");
        }
    }
}
