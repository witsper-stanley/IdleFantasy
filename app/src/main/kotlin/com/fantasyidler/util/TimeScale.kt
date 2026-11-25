package com.fantasyidler.util

import kotlin.math.roundToLong

/**
 * Fork mod: every wait timer (sessions, dungeons, bosses, crafting, workers, crops,
 * carnival cooldown) runs at this fraction of its original length.
 * 0.1 = ten times faster (a 60-minute session becomes 6 minutes). Rewards are unchanged.
 * Buff durations (blessings, XP boosts) and daily resets are NOT scaled.
 */
object TimeScale {
    const val FACTOR = 0.1

    fun scale(ms: Long): Long = (ms * FACTOR).roundToLong().coerceAtLeast(1L)
}
