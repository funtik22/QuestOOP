package wd;

import java.util.Scanner;

public class Main {
    public static Character manager;
    public static Story story;


    public static void main(String[] args) {



            Scanner in = new Scanner(System.in);
            System.out.println("Уважаемый игрок добро пожаловать в РПГ игру <Кровавый мир> \n "
                    + "Введите имя вашего игрового аватара:");
            manager = new Character(in.next());
            story = new Story();
            while (true) {
                manager.dexterity += story.current_situation.ddexterity;
                manager.force += story.current_situation.dforce;
                manager.build += story.current_situation.dbuild;
                manager.mana += story.current_situation.dmana;
                manager.intelligence += story.current_situation.dintelligence;

                System.out.println("=====\nЛовкость:" + manager.dexterity + "\tСила:"
                        + manager.force + "\tТелосложение:" + manager.build + "\tМана:" + manager.mana + "\tИнтеллект:" + manager.intelligence + "\n=====");
                System.out.println("============="
                        + story.current_situation.subject + "==============");
                System.out.println(story.current_situation.text);
                if (story.isEnd()) {
                    System.out
                        .println("________________НА ЭТОМ ПОКА ВСЁ, НО ВСЁ ДОРАБОТУЮ ДО ВЫХОДНЫХ И ИЗМЕНЮ СВОЙ ОТВЕТ______________________");
                    return;
                }
                story.go(in.nextInt());
            }

        }
    }

