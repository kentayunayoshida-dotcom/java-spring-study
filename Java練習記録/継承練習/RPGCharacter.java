//親クラス
class Character {

    String name;
    int level;
    int hp;
    int mp;

    //コンストラクタ
    Character(String name, int level, int hp, int mp) {
        this.name=name;
        this.level=level;
        this.hp=hp;
        this.mp=mp;
    }

    //共通メソッド
    void introduce() {
        System.out.println("名前:"+name);
        System.out.println("Lv:"+level);
        System.out.println("HP:"+hp);
        System.out.println("MP:"+mp);
    }

    //攻撃メソッド
    void attack() {
        System.out.println(name+"の攻撃！");
    }
}

//戦士クラス
class Warrior extends Character {

    Warrior(String name, int level, int hp, int mp) {
        //親クラスのコンストラクタを呼ぶ
        super(name, level, hp, mp);
    }

    //戦士専用メソッド
    void fireSlash() {
        System.out.println(name+"は「かえん斬り」を放った！");
    }

    //メソッド上書き
    //武器によって記述を変えて使いたい
    @Override
    void attack() {
        System.out.println(name+"は剣で切りつけた！");
    }
}

//魔法使いクラス
class Wizard extends Character {

    Wizard(String name, int level, int hp, int mp) {

        //親クラス呼び
        super(name, level, hp, mp);
    }

    //魔法使い専用メソッド
    void fireball() {
        System.out.println(name+"は「メラ」を唱えた！");
    }

    //オーバーライド
    @Override
    void attack() {
        System.out.println(name+"は呪文攻撃をした！");        
    }
}

//実行クラス
public class RPGCharacter {
    public static void main(String[] args) {

        Warrior warrior=new Warrior("アイザック", 36, 320, 90);
        Wizard wizard=new Wizard("アイリス", 32, 237, 220);

        System.out.println("=== 戦士 ===");
        warrior.introduce();
        warrior.attack();
        warrior.fireSlash();

        System.out.println();

        System.out.println("=== 魔法使い ===");
        wizard.introduce();
        wizard.attack();
        wizard.fireball();
    } 
}