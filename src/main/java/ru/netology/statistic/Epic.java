package ru.netology.statistic;

public class Epic extends Task {
    private String subtasks[];

    public Epic(int id, String[] subtasks) {
        super(id);
        this.subtasks = subtasks;
    }

    public String[] getSubtasks() {

        return subtasks;
    }

    @Override
    public boolean matches(String query) {
        for (String result : subtasks) {
            if (result.contains(query)) {
                return true;
            }
        }
        return false;
    }
}
