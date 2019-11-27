package Multithreading.task22.Snake;

import java.util.ArrayList;
import java.util.List;

public class Snake {
    private List<SnakeSection> sections;
    private boolean isAlive;
    private SnakeDirection direction;

    public Snake(int x, int y) {
        sections = new ArrayList<SnakeSection>();
        sections.add(new SnakeSection(x, y));
        isAlive = true;
    }

    public void move(int x, int y)
    {
        SnakeSection new_section = new SnakeSection(sections.get(0).getX()+x, sections.get(0).getY()+y);
        checkBorders(new_section);
        checkBody(new_section);
        if (isAlive) {
            sections.add(0, new_section);
            if ((Room.game.getMouse().getX() == new_section.getX()) && (Room.game.getMouse().getY() == new_section.getY())) {
                Room.game.eatMouse();
            } else {
                sections.remove(sections.size() - 1);
            }
        }
    }


    /**
     * Метод проверяет - находится ли новая голова в пределах комнаты
     */
    public void checkBorders(SnakeSection head){
        if(head.getX()<0 ||
                head.getY()<0 ||
                head.getX()>=Room.game.getWidth() ||
                head.getY()>=Room.game.getHeight())
            isAlive=false;
    }
    public void checkBody(SnakeSection head){
        if (sections.contains(head))
            isAlive=false;
    }


    public int getX() {
        return sections.get(0).getX();
    }

    public int getY() {
        return sections.get(0).getY();
    }

    public List<SnakeSection> getSections() {
        return sections;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public SnakeDirection getDirection() {
        return direction;
    }

    public void setDirection(SnakeDirection direction) {
        this.direction = direction;
    }
}
