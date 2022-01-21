package no.hvl.dat110.rpc.tests;

import no.hvl.dat110.rpc.RPCLocalStub;
import no.hvl.dat110.rpc.RPCUtils;

public class TestStringStringStub extends RPCLocalStub {

	public String m(String str) {
		
		byte[] request = RPCUtils.marshallString(str);
		
		byte[] reply = rpcclient.call(2,request);
		
		String strres = RPCUtils.unmarshallString(reply);
		
		return strres;
	}
}
