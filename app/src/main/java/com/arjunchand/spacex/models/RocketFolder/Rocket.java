package com.arjunchand.spacex.models.RocketFolder;

import com.arjunchand.spacex.models.RocketFolder.firststage.first_stage;
import com.arjunchand.spacex.models.RocketFolder.secondstage.second_stage;

public class Rocket {

    private String rocket_id;
    private String rocket_name;
    private String rocket_type;
    private first_stage firststage;
    private second_stage secondstage;

    public String getRocket_id() {
        return rocket_id;
    }

    public String getRocket_name() {
        return rocket_name;
    }

    public String getRocket_type() {
        return rocket_type;
    }

    public first_stage getFirststage() {
        return firststage;
    }

    public second_stage getSecondstage() {
        return secondstage;
    }
}
