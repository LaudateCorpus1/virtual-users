package com.atlassian.performance.tools.virtualusers

import com.atlassian.performance.tools.jiraactions.ActionMetricStatistics
import java.lang.StringBuilder
import java.util.*

class SimpleReport(
    val actionMetricStatistics: ActionMetricStatistics
) {
    fun generate(): String {
        val p95 = actionMetricStatistics.percentile(95)
        val report = StringBuilder()
        val formatter = Formatter(report)
        val lineFormat = "| %-25s | %-13d | %-8d | %-20d |\n"
        formatter.format("\n")
        formatter.format("+---------------------------+---------------+----------+----------------------+\n")
        formatter.format("| Action name               | sample size   | errors   | 95th percentile [ms] |\n")
        formatter.format("+---------------------------+---------------+----------+----------------------+\n")

        actionMetricStatistics.sampleSize.keys.forEach { action ->
            formatter.format(
                lineFormat,
                action,
                actionMetricStatistics.sampleSize[action],
                actionMetricStatistics.errors[action],
                p95[action]?.toMillis()
            )
        }
        formatter.format("+---------------------------+---------------+----------+----------------------+\n")
        return report.toString()
    }
}