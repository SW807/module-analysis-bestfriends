package dk.aau.cs.psylog.bestfriends;

import dk.aau.cs.psylog.module_lib.ScheduledService;

public class PsyLogService extends ScheduledService {

    public PsyLogService() {super("PsyLogIntentServiceBestFriends");
    }

    @Override
    public void setScheduledTask() {
        scheduledTask = new BestFriendsListener();
    }
}
