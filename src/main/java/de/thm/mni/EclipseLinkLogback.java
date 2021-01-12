package de.thm.mni;

import org.eclipse.persistence.logging.AbstractSessionLog;
import org.eclipse.persistence.logging.SessionLog;
import org.eclipse.persistence.logging.SessionLogEntry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EclipseLinkLogback extends AbstractSessionLog implements SessionLog {

    private static Logger log = LoggerFactory.getLogger(EclipseLinkLogback.class);

    @Override
    public void log(SessionLogEntry sessionLogEntry) {
        log.info(sessionLogEntry.getMessage()); // untranslated/undecoded message_id
    }
}
