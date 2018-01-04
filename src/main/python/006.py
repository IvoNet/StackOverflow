#!/usr/bin/env python
#  -*- coding: utf-8 -*-

template = r'''

\documentclass{article}

#skipped all packages

\begin{document}

\begin{tabularx}{\linewidth}{|l|X|} 
\hline 
Reference Plan: & Marine Travel Routes and Management Plan for High Speed Ferries of SkyPier (EP Condition 2.10) \\
\hline
Monitoring Data: & Ferry movement data collected in the period between 
\textbf{\underbar{"%(start_date)s" to "%(end_date)s"}} \\
\hline
Information and Data Checked: 
&\CheckedBox Automatic Identification System (AIS) Data \newline
\CheckedBox Daily SkyPier HSF movements \newline
\CheckedBox Record of potential deviations \newline
\CheckedBox Response provided by the ferry operators\\
\hline
Comments and Observations: & The deviation of implementation of SkyPier HSF plan was checked. Eight notices were issued by AAHK to ferry operators related to potential speeding across the SCZ, not travelling through the gate access points and \\
\hline

\end{tabularx}

\end{document}

'''

page = template % {'start_date': 'a', 'end_date': 'b'}
print page