/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.deri.iris.parser.node;

import org.deri.iris.parser.analysis.*;

@SuppressWarnings("nls")
public final class TTPreHex extends Token
{
    public TTPreHex()
    {
        super.setText("_hexbinary");
    }

    public TTPreHex(int line, int pos)
    {
        super.setText("_hexbinary");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TTPreHex(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTTPreHex(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TTPreHex text.");
    }
}