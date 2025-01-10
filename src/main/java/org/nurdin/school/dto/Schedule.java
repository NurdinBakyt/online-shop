package org.nurdin.school.dto;

import java.util.Map;


public class Schedule {
    private Long id;
    /**
     * Это поле которое будкет хравнить в себе данные о расписаний.
     * Сделал его ключ-значение т.к у нас будет много несколько классов.
     * типо так -
     * Schedule{id=1, timetable={Classes{name='1A'}={TimeSlot{dayOfWeek='Monday', lessonNumber=1}=Subject{name='Математика', hoursPerWeek=5, teacher=Иванов}}}}
     */
    private Map<Classes, Map<TimeSlot, Subject>> timetable;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Map<Classes, Map<TimeSlot, Subject>> getTimetable() {
        return timetable;
    }

    public void setTimetable(Map<Classes, Map<TimeSlot, Subject>> timetable) {
        this.timetable = timetable;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "id=" + id +
                ", timetable=" + timetable +
                '}';
    }
}