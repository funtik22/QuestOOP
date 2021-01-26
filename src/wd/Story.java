package wd;

public class Story {
    private Situation start_story;
    public Situation current_situation;
    Story() {
        start_story = new Situation(
                "Меню настроки вашего игрового аватара",
                "Вас приветствует мастер настройки вашего аватара!\n"
                        + "Для начала вам нужно выбрать рассу, для этого вам будут заданы направляющие вопросы."
                        + "Выберете самый подходящий из перечисленных.\n"
                        + "(1)Вы благородный человек, Ваши главные черты доблесть и любовь к природе\n"
                        + "(2)Вы враждебны ко всему прекрасному и чистому, склонны к вандализму\n"
                        + "(3)Вы любите заниматься подземным мастерством. Ваши руки сверкают как драгоценные камни? ",
                 3, 0, 0, 0, 0, 0);
        start_story.direction[0] = new Situation(
                "Эльф",
                "Поздравляю Вы выбрали рассу эльфов! Вам предстоит долгая дорога развития, удачи!",
                0, 15, 5, 3, 10, 7);
        start_story.direction[1] = new Situation(
                "Орк",
                "Поздравляю Вы выбрали рассу Орк! Теперь Вы, как непроходимая глыба. Все испытания покажутся вам лёгкими и беззаботными"
                        +"Но это не так!",
                0, 3, 17, 15, 5, 0);
        start_story.direction[2] = new Situation(
                "Гном",
                "Поздравляю Вы выбрали рассу Орк!"
                        + " Желаем удачи в изучении горного мастерства",
                0, 7,
                5, 5,7, 10);
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



