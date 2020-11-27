package com.smartrectuiters.java11;

public class Unicode10Support {
    public static void main(String[] args) {
        //56 new emoji were added to unicode 10 !
        //🤩 Star-Struck, 🤨 Face With Raised Eyebrow, 🤯 Exploding Head,
        //🤪 Crazy Face, 🧠 Brain, 🧚 Fairy, 🥨 Pretzel, 🦖 T-Rex
        //🥢 Chopsticks, 🥟 Dumpling, 🥠 Fortune Cookie
        var emoji = "\uD83E\uDD29, \uD83E\uDD28, \uD83E\uDD2F," +
                " \uD83E\uDD2A, \uD83E\uDDE0, \uD83E\uDDDA, \uD83E\uDD68, \uD83E\uDD96," +
                "\uD83E\uDD62 \uD83E\uDD5F, \uD83E\uDD60";

        System.out.println(emoji);
    }
}
