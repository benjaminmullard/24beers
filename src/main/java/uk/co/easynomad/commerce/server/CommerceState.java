package uk.co.easynomad.commerce.server;

public enum CommerceState
{

    INITIAL {
        public CommerceState nextState()
        {

        }
    }

    public abstract CommerceState nextState();
}