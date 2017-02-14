//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package org.wso2.carbon.udf;

public class SplitExceptionPattern {
    public SplitExceptionPattern() {
    }

    public String splitPattern(String pattern) {
        String edgestring = "";
        String[] parts = pattern.split("-");

        for(int i = 0; i < parts.length - 1; ++i) {
            if(i == parts.length - 2) {
                edgestring = edgestring + parts[i] + "," + parts[i + 1];
            } else {
                edgestring = edgestring + parts[i] + "," + parts[i + 1] + "-";
            }
        }

        return edgestring;
    }
}
