package no.hvl.dat110.rpc.tests;

import no.hvl.dat110.rpc.RPCLocalStub;
import no.hvl.dat110.rpc.RPCUtils;

public class TestVoidVoidStub extends RPCLocalStub {

	public void m() {
		
		byte[] request = RPCUtils.marshallVoid();
		
		byte[] reply = rpcclient.call(1,request);
		
		RPCUtils.unmarshallVoid(reply);
		
	}
}
