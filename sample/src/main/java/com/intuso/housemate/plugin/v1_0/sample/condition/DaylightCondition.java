package com.intuso.housemate.plugin.v1_0.sample.condition;

import com.google.inject.Inject;
import com.google.inject.assistedinject.Assisted;
import com.intuso.housemate.plugin.v1_0.api.annotations.TypeInfo;
import com.intuso.housemate.plugin.v1_0.api.driver.ConditionDriver;
import org.slf4j.Logger;

@TypeInfo(id = "daylight-condition", name = "Daylight Condition", description = "Condition that is true when the sun is shining")
public class DaylightCondition implements ConditionDriver {

    @Inject
    public DaylightCondition(@Assisted Logger logger, @Assisted ConditionDriver.Callback callback) {}

    @Override
    public boolean hasChildConditions() {
        return false;
    }

    @Override
    public void start() {
        // start checking for sunset/sunrise times, eg via a webservice or outdoor light sensor
    }

    @Override
    public void stop() {
        // stop checking sunset/sunrise times
    }
}
