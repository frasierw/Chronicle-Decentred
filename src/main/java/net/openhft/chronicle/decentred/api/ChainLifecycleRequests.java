package net.openhft.chronicle.decentred.api;

import net.openhft.chronicle.bytes.MethodId;
import net.openhft.chronicle.decentred.dto.chainlifecycle.AssignDelegatesRequest;
import net.openhft.chronicle.decentred.dto.chainlifecycle.CreateChainRequest;
import net.openhft.chronicle.decentred.dto.chainlifecycle.CreateTokenRequest;

public interface ChainLifecycleRequests {

    @MethodId(0x0101)
    void createChainRequest(CreateChainRequest createChainRequest);

    @MethodId(0x0102)
    void assignDelegatesRequest(AssignDelegatesRequest assignDelegatesRequest);

    @MethodId(0x0103)
    void createTokenRequest(CreateTokenRequest createTokenRequest);

}
