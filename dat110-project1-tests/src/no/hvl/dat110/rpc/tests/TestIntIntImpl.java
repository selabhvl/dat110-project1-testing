package no.hvl.dat110.rpc.tests;

import no.hvl.dat110.rpc.RPCRemoteImpl;
import no.hvl.dat110.rpc.RPCUtils;

public class TestIntIntImpl implements RPCRemoteImpl {

	public byte[] invoke(byte[] request) {
		
		int x = RPCUtils.unmarshallInteger(request);
		
		int resx = m(x);
		
		byte[] reply = RPCUtils.marshallInteger(resx);
		
		return reply;
	}
	
	public int m(int x) {
		System.out.println("int m("+x+") executed");
		return x;
	} 
}
