package uk.co.easynomad.commerce.server;

public enum CommerceState
{
    INITIAL
    {
        @Override
        public CommerceState getNextState()
        {
            final CommerceState nextState;

            nextState = null;

            return nextState;
        }
    },
    BROWSING_NO_PERSONALISATION
    {
        @Override
        public CommerceState getNextState() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    },
    BROWSING_WITH_PERSONALISATION
    {
        @Override
        public CommerceState getNextState() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    };

    public abstract CommerceState getNextState();
}