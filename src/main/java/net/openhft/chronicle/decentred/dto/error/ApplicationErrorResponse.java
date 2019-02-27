package net.openhft.chronicle.decentred.dto.error;

import net.openhft.chronicle.decentred.dto.base.VanillaSignedMessage;

public class ApplicationErrorResponse extends VanillaSignedMessage<ApplicationErrorResponse> {
    private VanillaSignedMessage origMessage;
    private String reason;

    public String reason() {
        return reason;
    }

    public ApplicationErrorResponse reason(String reason) {
        assertNotSigned();
        this.reason = reason;
        return this;
    }

    public ApplicationErrorResponse init(VanillaSignedMessage origMessage, String reason) {
        assertNotSigned();
        this.origMessage = origMessage;
        this.reason = reason;
        return this;
    }

    public VanillaSignedMessage origMessage() {
        return origMessage;
    }
}
