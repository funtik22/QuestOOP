package wd;

public class Story {
    private Situation start_story;
    public Situation current_situation;
  
    Story() {
        start_story = new Situation(
                "Меню настроки вашего игрового аватара",
                "Вас приветствует мастер настройки вашего аватара!\n"
                        + "Для начала вам нужно выбрать рассу, для этого вам будут заданы направляющие вопросы."
                        + "Выберете самый подходящий вариант из перечисленных.\n"
                        + "(1)Вы благородный человек, Ваши главные черты доблесть и любовь к природе\n"
                        + "(2)Вы враждебны ко всему прекрасному и чистому, склонны к вандализму\n"
                        + "(3)Вы любите заниматься подземным мастерством. Ваши руки сверкают как драгоценные камни? ",
                 3, 0, 0, 0, 0, 0);
        start_story.direction[0] = new Situation(
                "Эльф",
                "Поздравляю Вы выбрали рассу эльфов! Вам предстоит долгая дорога развития, удачи!\n"+
                "(1)Продолжить настройку персонажа",
                1, 15, 5, 3, 10, 7);
        start_story.direction[1] = new Situation(
                "Орк",
                "Поздравляю Вы выбрали рассу Орк! Теперь Вы, как непроходимая глыба. Все испытания покажутся вам лёгкими и беззаботными"
                        +"Но это не так!\n"+
                        "(1)Продолжить настройку персонажа",
                1, 3, 17, 15, 5, 0);
        start_story.direction[2] = new Situation(
                "Гном",
                "Поздравляю Вы выбрали рассу Гном!"
                        + " Желаем удачи в изучении горного мастерства\n"+
                        "(1)Продолжить настройку персонажа",
                1, 7,
                5, 5,7, 10);
        start_story.direction[0].direction[0] = new Situation("Поздравляю! Вы выбрали расу", "Теперь перейдём к выбору класса\n"
                +"Выберете самый подходящий вариант из перечисленных.\n"
                +"(1)Вы настоящий вор, любите быть скрытным и невидимым. Короткие клинки ваше любимое оружие?\n"
        +"(2)Вы на ты разговариваете со смертью,хотите уничтожать врагов темными чарами и исцелять союзников магией смерти\n?"
        +"(3)Вы борец за правду и справедливость? Любите божественную магию?", 3, 0,0,0,0,0);
        start_story.direction[0].direction[0].direction[0] = new Situation(
                "Рога",
                "Поздравляю Вы выбрали класс воров! Этому искусству вам ещё долго учится!"+
                        "(1)Перейти к выбору стартовой локации",
                1, 12, 7, 4, 8, 10);
        start_story.direction[0].direction[0].direction[1] = new Situation(
                "Некромант",
                "Поздравляю Вы выбрали класс некромантов! Умереть вам будет не просто?!"+
                        "(1)Перейти к выбору стартовой локации",
                1, 2, 4, 7, 10, 7);
        start_story.direction[0].direction[0].direction[2] = new Situation(
                "Паладин",
                "Поздравляю Вы выбрали класс паладинов! Да пибудут с вами боги"+
                        "(1)Перейти к выбору стартовой локации",
                1, 10, 8, 6, 12, 7);
        start_story.direction[1].direction[0] = new Situation("Поздравляю! Вы выбрали расу", "Теперь перейдём к выбору класса\n"
                +"Выберете самый подходящий вариант из перечисленных.\n"
                +"(1)Вы настоящий вор, любите быть скрытным и невидимым. Короткие клинки ваше любимое оружие?\n"
                +"(2)Вы на ты разговариваете со смертью,хотите уничтожать врагов темными чарами и исцелять союзников магией смерти\n?"
                +"(3)Вы борец за правду и справедливость? Любите божественную магию?", 3, 0,0,0,0,0);
        start_story.direction[1].direction[0].direction[0] = new Situation(
                "Рога",
                "Поздравляю Вы выбрали класс воров! Этому искусству вам ещё долго учится!"+
                        "(1)Перейти к выбору стартовой локации",
                1, 12, 7, 4, 8, 10);
        start_story.direction[1].direction[0].direction[1] = new Situation(
                "Некромант",
                "Поздравляю Вы выбрали класс некромантов! Умереть вам будет не просто?!"+
                        "(1)Перейти к выбору стартовой локации",
                1, 2, 4, 7, 10, 7);
        start_story.direction[1].direction[0].direction[2] = new Situation(
                "Паладин",
                "Поздравляю Вы выбрали класс паладинов! Да пибудут с вами боги"+
                        "(1)Перейти к выбору стартовой локации",
                1, 10, 8, 6, 12, 7);
        start_story.direction[2].direction[0] = new Situation("Поздравляю! Вы выбрали расу", "Теперь перейдём к выбору класса\n"
                +"Выберете самый подходящий вариант из перечисленных.\n"
                +"(1)Вы настоящий вор, любите быть скрытным и невидимым. Короткие клинки ваше любимое оружие?\n"
                +"(2)Вы на ты разговариваете со смертью,хотите уничтожать врагов темными чарами и исцелять союзников магией смерти\n?"
                +"(3)Вы борец за правду и справедливость? Любите божественную магию?", 3, 0,0,0,0,0);
        start_story.direction[2].direction[0].direction[0] = new Situation(
                "Рога",
                "Поздравляю Вы выбрали класс воров! Этому искусству вам ещё долго учится!"+
                        "(1)Перейти к выбору стартовой локации",
                1, 12, 7, 4, 8, 10);
        start_story.direction[2].direction[0].direction[1] = new Situation(
                "Некромант",
                "Поздравляю Вы выбрали класс некромантов! Умереть вам будет не просто?!"+
                        "(1)Перейти к выбору стартовой локации",
                1, 2, 4, 7, 10, 7);
        start_story.direction[2].direction[0].direction[2] = new Situation(
                "Паладин",
                "Поздравляю Вы выбрали класс паладинов! Да пибудут с вами боги"+
                        "(1)Перейти к выбору стартовой локации",
                1, 10, 8, 6, 12, 7);
        current_situation = start_story;
    }



    public void go(int num) {
        if (num <= current_situation.direction.length)
            current_situation = current_situation.direction[num - 1];
        else
            System.out.println("Вы можете выбирать из "
                    + current_situation.direction.length + " вариантов");
    }

    public boolean isEnd() {
        return current_situation.direction.length == 0;
    }
}



