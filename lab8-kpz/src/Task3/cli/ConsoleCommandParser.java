package Task3.cli;

import Task3.application.ScheduleAppointmentCommand;

/** Pure Fabrication: перетворює текст з консолі на команду. */
public class ConsoleCommandParser {
    public ScheduleAppointmentCommand parse(String patientName, String doctorCategory) {
        if (patientName.isBlank() || doctorCategory.isBlank()) {
            throw new IllegalArgumentException("Ім'я та категорія не можуть бути порожніми");
        }
        return new ScheduleAppointmentCommand(patientName.trim(), doctorCategory.trim());
    }
}
